package runtime;

import emitters.EmitterLifetime;
import emitters.EmitterRate;
import emitters.EmitterShape;
import emitters.init.EmitterInitialization;
import emitters.init.EmitterLocalSpace;

public class ParticleEmitter {
    int emitter_age;

    final double emitter_random1;
    final double emitter_random2;
    final double emitter_random3;
    final double emitter_random4;

    final EmitterLocalSpace local_space;
    final EmitterInitialization initialization;

    final EmitterLifetime lifetime;
    final EmitterRate rate;
    final EmitterShape shape;

    public ParticleEmitter(EmitterInitialization initialization, EmitterLocalSpace local_space,
                           EmitterLifetime lifetime, EmitterRate rate, EmitterShape shape) {
        this.emitter_age = 0;

        this.emitter_random1 = Math.random();
        this.emitter_random2 = Math.random();
        this.emitter_random3 = Math.random();
        this.emitter_random4 = Math.random();

        this.initialization = initialization;
        this.local_space = local_space;

        this.lifetime = lifetime;
        this.rate = rate;
        this.shape = shape;
    }

    public void tick() {
        emitter_age++;
    }
}
