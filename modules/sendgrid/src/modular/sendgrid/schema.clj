;; Copyright © 2015 JUXT LTD.

(ns modular.sendgrid.schema
  (:require
   [schema.core :as s]))

(def SendgridEmailer
  {:sendgrid
   {:user s/Str
    :password s/Str}})
