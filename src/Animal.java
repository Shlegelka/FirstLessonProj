public abstract class Animal
{
    private float maxRunDistance;
    private float maxSwimDistance;

    public Animal(float maxRunDistance, float maxSwimDistance)
    {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run0n(float requiredDistance){
       if (requiredDistance > maxRunDistance)
       {
           System.out.println("Не может пробежать: " + requiredDistance);
           System.out.println("Максимум возможностей: " + maxRunDistance);
       }
       else
       {
           System.out.println("Растояние для бега: " + requiredDistance + " преодалено");
       }
       System.out.println();
    }

    public abstract void run0n();
}
