package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class apptest {
    @Test
    public void t1() {
        assertThat(new app().plus(10, 20)).isEqualTo(30);
    }

    @Test
    public void t2() {
        assertThat(new app().plus(20, 20)).isEqualTo(40);
    }

}
