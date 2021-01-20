class ModelDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) : Duck(flyBehavior, quackBehavior) {
    init{
        println("Created new Model duck")
    }
}