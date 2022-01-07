import kantan.csv.ops.toCsvInputOps
import kantan.csv.rfc
import kantan.csv.generic._

import java.io.File

case class Car(Ano: Int, Marca: String, Modelo: String, Descripcion: String, Precio: Float)

val path2DataFile2 = "C:/Users/giale/Downloads/Libro1.csv"
val dataSource2 = new File(path2DataFile2).readCsv[List,Car](rfc.withHeader(true).withCellSeparator(';'))
  .foreach(println _)

case class Goleador (jugador: String,
                       club: String,
                       nacionalidad: String,
                       goles: Int,
                       autogol: String
                      )

val path2DataFile = "C:/Users/giale/Downloads/Goleadores_LigaPro_2019.csv"
val dataSource2 = new File(path2DataFile).readCsv[List,Goleador](rfc.withHeader(true).withCellSeparator(';'))
val rows = dataSource2.collect({case Right(goleador) => goleador})
rows.foreach(println _)

val clubes = rows.map(_.club).distinct
clubes.foreach(println _)

