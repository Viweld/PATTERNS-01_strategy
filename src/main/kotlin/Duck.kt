abstract class Duck(var flyBehavior:FlyBehavior, var quackBehavior:QuackBehavior) {
    fun performFly(){
        flyBehavior.fly()
    }
    fun performQuack(){
        quackBehavior.quack()
    }

    /*@JvmName("setFlyBehavior1")
    fun setFlyBehavior(fb:FlyBehavior){
        flyBehavior=fb
    }

    @JvmName("setQuackBehavior1")
    fun setQuackBehavior(qb:QuackBehavior){
        quackBehavior=qb
    }*/
}