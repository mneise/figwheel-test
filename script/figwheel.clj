(require '[figwheel-sidecar.repl-api :as ra])

;; this will start figwheel and will start autocompiling the builds specified in `:builds-ids`
(ra/start-figwheel!
  {:figwheel-options {} ;; <-- figwheel server config goes here 
   :build-ids ["dev"]   ;; <-- a vector of build ids to start autobuilding
   :all-builds          ;; <-- supply your build configs here
   [{:id "dev"
     :figwheel true
     :source-paths ["src"]
     :compiler {:main "figwheel-test.core"
                :output-to "out/figwheel_test.js"
                :output-dir "out"
                :verbose true}}]})

;; start a ClojureScript REPL
(ra/cljs-repl)
