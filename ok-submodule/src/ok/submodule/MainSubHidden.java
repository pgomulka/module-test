package ok.submodule;

import main.module.test.Hidden;

public class MainSubHidden implements Hidden {
    @Override
    public void x() {
        System.out.println("main sub hidden");
    }
}
