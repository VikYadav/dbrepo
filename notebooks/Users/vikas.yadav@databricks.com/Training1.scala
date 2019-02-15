// Databricks notebook source
//dbutils.fs.mkdirs("dbfs:/FileStore/TestVik")
//this is the cahange made outside the notbook! Testing saw the outsider change now ignoring it
display(dbutils.fs.ls("dbfs:/FileStore/TestVik"))

// COMMAND ----------

display(dbutils.fs.ls("dbfs:/FileStore/tables/first.txt"))

// COMMAND ----------

val partition_path = dbutils.fs.ls("dbfs:/FileStore/TestVik/").filter(r => r.name.endsWith(".txt"))(0).path
dbutils.fs.cp(partition_path,"dbfs:/FileStore/tables/outputFile.csv")


// COMMAND ----------

// MAGIC %sh #!bin/bash
// MAGIC 
// MAGIC apt-get install python-rdkit librdkit1 rdkit-data