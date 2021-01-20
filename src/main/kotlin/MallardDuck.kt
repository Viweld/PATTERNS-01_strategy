class MallardDuck(flyBehavior: FlyBehavior=FlyWithWings(), quackBehavior: QuackBehavior=Quack()) : Duck(flyBehavior, quackBehavior) {
    init{
        println("Created new Mallard Duck")
    }
}
