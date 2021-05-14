object bookstore extends App{
  def cost(x:Int):Double={
    if(x>50){
      x*24.95*0.6+3+0.75*(x-50)
    }
    else
    {
      x*24.95*0.6+3

    }
  }
  println(cost(60))

}
