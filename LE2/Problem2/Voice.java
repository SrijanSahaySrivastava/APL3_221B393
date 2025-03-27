class Voice
{
    
    void prepareVoice()
    {
        Animal[] an = new Animal[5];
        an[0] = new Cow();
        an[1] = new Dog();
        an[2] = new Pig();
        an[3] = new Goat();
        an[4] = new Lion();
        hear(an);
    }
    
    public void hear(Animal[] an)
    {
        for(int i = 0; i < 5 ; i++ )
        {
            an[i].makeVoice();
        }
    
    }
}