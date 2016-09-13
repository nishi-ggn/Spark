package org.myspark.dataframe
import org.apache.spark.sql._
import org.apache.spark.SparkContext

object MyDataFrame
{
   def main(args: Array[String]) = {
      val spark = new SparkContext;
      val sc = new SQLContext(spark);
      val file = sc.read.json("input.json");
      
      
      file.show();
   } 
}