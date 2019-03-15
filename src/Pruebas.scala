import scala.collection.mutable.ListBuffer


class Paciente(var nombre:String="Juan",
    var primerAp:String="Gonzales", 
    var segAp:String="Marquez",
    var edad:Byte=45,
    var fecha:ListBuffer[String]=ListBuffer("10-02-2019","10-02-2019","11-02-2019"),
    var horaRegistro:ListBuffer[String]=ListBuffer("10:34","13:45","10:00"),
    var nivelBienestar:ListBuffer[Int]=ListBuffer(1,3,5),
    var temperatura:ListBuffer[Double]=ListBuffer(35,36,37),
    var humedad:ListBuffer[Double]=ListBuffer(56,60,50)){
  
  def promNivBienestar():Double={
    var sum=0
    for(e<-nivelBienestar){
      sum+=e
    }
    var prom=sum/nivelBienestar.length
    return prom
  }
  
  def mayor():Int={
    var mayor=0.0
    var cont=0
    for(i<-0 until temperatura.length){
      if(temperatura(i)>mayor){
        mayor=temperatura(i)
        cont=i
      }
    }
      return cont
  }
   def menor():Int={
    var menor=100.0
    var cont=0
    for(i<-0 until temperatura.length){
      if(temperatura(i)<menor){
        menor=temperatura(i)
        cont=i
      }
      
    }
      return cont
  }
   def mostrarDatosMenor(){
    
    var cont=menor()
    
     println(" Datos de su temperatura mas baja registrada")
     println("Temperatura mayor: "+temperatura(cont))
     println("Fecha registrada: "+fecha(cont))
     println("Hora Registrada: "+horaRegistro(cont))
     println("Nivel de bienestar: "+nivelBienestar(cont))
     println("Humedad registrada: "+humedad(cont))
  }
  def mostrarDatosMayor(){
    
    var cont=mayor()
    
   
     println(" Datos de su temperatura mayor")
     println("Temperatura mayor: "+temperatura(cont))
     println("Fecha registrada: "+fecha(cont))
     println("Hora Registrada: "+horaRegistro(cont))
     println("Nivel de bienestar: "+nivelBienestar(cont))
     println("Humedad registrada: "+humedad(cont))
  }
  def datosPaciente(){
     println("DATOS DEL PACIENTE")
     println("Nombre: "+nombre)
     println("Nombre: "+primerAp)
     println("Nombre: "+segAp)
     println("Nombre: "+edad)
     println("                  ")
  }
  
 
}
object Pruebas {
  def main(args: Array[String]): Unit = {
    
  var  p1 =new Paciente()
  p1.datosPaciente()
  p1.mostrarDatosMayor()
  println("           ")
  p1.mostrarDatosMenor()
  println("           ")
  println("El nivel de bienestar es: "+p1.promNivBienestar())
  }
}