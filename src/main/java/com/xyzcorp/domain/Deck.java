package com.xyzcorp.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Source: Ted Young
 * <a href="https://moretestable.com/">MoreTestable.com</a>
 */
public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(cards);
    }

    public int size() {
        return cards.size();
    }

    public Card draw() {
        return cards.remove(0);
    }
}
