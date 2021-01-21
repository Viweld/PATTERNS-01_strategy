abstract class Duck(var flyBehavior:FlyBehavior, var quackBehavior:QuackBehavior) {
    fun performFly(){
        flyBehavior.fly()
    }
    fun performQuack(){
        quackBehavior.quack()
    }
}