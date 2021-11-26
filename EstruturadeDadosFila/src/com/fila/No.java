package com.fila;

public class No<T> {

    private T object;
    private No<T> refNo;

    public No(){
    }

    public No(T object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @SuppressWarnings("rawtypes")
	public No getRefNo() {
        return refNo;
    }

    @SuppressWarnings("unchecked")
	public void setRefNo(@SuppressWarnings("rawtypes") No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}