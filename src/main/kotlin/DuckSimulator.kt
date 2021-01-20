fun main(args:Array<String>){
    val mallard=MallardDuck()
    mallard.performFly()
    mallard.performQuack()
    val model=ModelDuck()
    model.performFly()
    model.performQuack()
    model.flyBehavior=FlyRocketPowered()
    model.performFly()
    model.performQuack()



}
