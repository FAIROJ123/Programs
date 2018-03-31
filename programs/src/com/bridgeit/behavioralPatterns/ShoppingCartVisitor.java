package com.bridgeit.behavioralPatterns;

public interface ShoppingCartVisitor
{
	int visit(Book book);
	int visit(Fruit fruit);
}
