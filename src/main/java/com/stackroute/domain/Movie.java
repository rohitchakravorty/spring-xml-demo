package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanFactoryAware, ApplicationContextAware, BeanNameAware{
    private  Actor actor,actor1,actor2;

    public Movie() {

    }

    public Movie(Actor actor, Actor actor1, Actor actor2) {
        this.actor = actor;
        this.actor1 = actor1;
        this.actor2 = actor2;
    }
        public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actor1=" + actor1 +
                ", actor2=" + actor2 +
                '}';
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanfactory"+beanFactory);

    }

    public void setBeanName(String s) {
        System.out.println("beanname"+s);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application"+applicationContext);

    }
}
