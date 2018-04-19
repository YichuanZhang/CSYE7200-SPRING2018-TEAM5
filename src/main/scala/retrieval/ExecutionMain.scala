package retrieval

import java.io.{BufferedWriter, FileWriter}

import retrieval.UseCases.{Top_K_Prices, Top_K_Brands, Top_K_Colors, buf}
import org.apache.log4j.Logger
import org.apache.log4j.Level

object ExecutionMain extends App {

  Logger.getLogger("org").setLevel(Level.OFF)
  Logger.getLogger("akka").setLevel(Level.OFF)



  Top_K_Colors(10).foreach(println)
  Top_K_Brands(10).foreach(println)
//  print(Top_k_p())//normal prices in String format

  //k-means deal with prices
  Top_K_Prices().foreach(println)



  val file4 = "item.txt"
  val writer4 = new BufferedWriter(new FileWriter(file4, true))
  for(x <- buf){
    writer4.append(x + "\n")
  }
  writer4.close()




}