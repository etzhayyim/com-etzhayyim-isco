;; KOTOBA Mesh entry component for the ILO ISCO-08 classification mirror.
;; Host imports kqe-assert! and kqe-query are supplied by kotoba:kais/kqe.
(ns isco)

(defn observe []
  (kqe-assert! "isco" "software-developer" "classified" "group-251")
  (kqe-assert! "isco" "data-scientist" "classified" "group-251")
  (kqe-assert! "isco" "nurse" "classified" "group-222")
  (kqe-query "taxonomy(?g) :- classified(?g)."))

(defn run [_ctx] (observe))
(defn on-kse [_topic _payload] (observe))
