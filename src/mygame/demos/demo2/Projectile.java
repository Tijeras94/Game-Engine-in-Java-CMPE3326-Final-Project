package mygame.demos.demo2;

import mygame.engine.AudioPlayer;
import mygame.engine.Sprite;

class Projectile extends Sprite {

    public int Damage;
    private int speed;
    public boolean isActive;

    AudioPlayer musicSound = new AudioPlayer("Demo2Assets/Sound/laserFire.wav", true);

    public boolean isIsActive() {
        return isActive;
    }
    private Sprite parent;

    public Projectile(Sprite parent) {
        super("Demo2Assets/laser.png");
        this.setCenterPivot(false);
        this.parent = parent;
        Damage = 10;
        speed = 10;
        isActive = true;
        musicSound.play();
    }

    @Override
    public void update() {
        this.x += speed;

        if (this.x > this.parent.getWidth()) {
            isActive = false;
        }
    }
}
