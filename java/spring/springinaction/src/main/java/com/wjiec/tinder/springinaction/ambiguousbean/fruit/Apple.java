package com.wjiec.tinder.springinaction.ambiguousbean.fruit;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("apple")
public class Apple implements Fruit {
}
