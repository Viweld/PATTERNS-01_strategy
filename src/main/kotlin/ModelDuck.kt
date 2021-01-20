class ModelDuck(flyBehavior: FlyBehavior=FlyNoWay(), quackBehavior: QuackBehavior=Mute()) : Duck(flyBehavior, quackBehavior) {
    init{
        println("Created new Model duck")
    }
}