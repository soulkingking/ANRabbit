package com.anrabbit.ui;

import dagger.Subcomponent;

/**
 * Created by soul on 2017/9/7.
 */

@Subcomponent(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
