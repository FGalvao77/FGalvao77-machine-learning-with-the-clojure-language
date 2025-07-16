(ns meu-projeto.core
  (:require [tech.v3.dataset :as ds]
            [tech.v3.dataset.modelling :as ds-mod]
            [scicloj.smile.classification :as smile.class]))

(defn -main [& args]
  (println "Iniciando projeto de classificação com Clojure!")

  ;; Carregar o dataset
  (let [iris-data (ds/->dataset "resources/dados_iris.csv")

        ;; Dividir em treino e teste
        {:keys [train-df test-df]} (ds-mod/train-test-split iris-data {:split-type :random :train-fraction 0.8})

        ;; Treinar o modelo
        model (smile.class/random-forest (dissoc train-df :species) (:species train-df) {:n-trees 10})

        ;; Fazer previsões
        predictions (smile.class/predict model (dissoc test-df :species))

        ;; Avaliar o modelo
        accuracy (let [actual (:species test-df)
                       correct (count (filter true? (map = actual predictions)))]
                   (/ correct (count actual)))]

    (println "Acurácia do modelo:" (* 100.0 accuracy) "%")))