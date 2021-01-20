fun main(args:Array<String>){
    val mallard=MallardDuck(FlyWithWings(),Quack())
    mallard.performFly()
    mallard.performQuack()
    val model=ModelDuck(FlyNoWay(),Mute())
    model.performFly()
    model.performQuack()
    model.setFlyBehavior(FlyRocketPowered())
    model.performFly()
    model.performQuack()



}
