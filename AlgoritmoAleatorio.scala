import scala.util.Random

object AlgoritmoAleatorio{
def main(args:Array[String]){

var A=Array(5,2,8,4,1)
var P=new Array[Int](A.length)
var R=new Array[Int](A.length)
var ale =new Random
var i=0

for (i<-0 to A.length-1)
{
  P(i)=ale.nextInt(10)
}

var z=0
var j=0
var x=0
var otra=0

for(z<-1 to A.length-1 )
{
  j= i
  while( j > 0 && R(j-1) > R(j) )
  {
    x=P(j)
    otra=A(j)
    R(j)=R(j-1)
    A(j)=A(j-1)
    P(j-1)=x
    A(j-1)=otra
    j=j-1
  }
}

println("El arreglo con el nuevo ordenamiento es = ")
for(z<-0 to A.length-1)
{
  print(P(z)+" ")
}
print(".\n")

}
}
