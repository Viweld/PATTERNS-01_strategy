class MallardDuck(flyBehavior: FlyBehavior, quackBehavior: QuackBehavior) : Duck(flyBehavior, quackBehavior) {
    init{
        println("Created new Mallard Duck")
    }
}
