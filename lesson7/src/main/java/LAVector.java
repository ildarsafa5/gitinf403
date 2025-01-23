public class LAVector {

    private float[] components;

    public LAVector(int size) {
        components = new float[size];
    }

    public LAVector(float[] components) {
        this.components = components;
    }

    public LAVector(int size,float value) {
        components = new float[size];
        for (int i = 0; i < size; i++) {
            components[i] = value;
        }
    }

    public LAVector plusVector(LAVector other) {
        if (getSize() != other.getSize()) {
            return null;
        } else {
            LAVector sumVector = new LAVector(getSize());
            for (int i = 0; i < getSize(); i++) {
                sumVector.setComponent(getComponent(i)+ other.getComponent(i),i);
            }
            return sumVector;
        }
    }

    public LAVector multNumber(float number) {
        LAVector multVector = new LAVector(getSize());
        for (int i = 0; i < getSize(); i++) {
            multVector.setComponent(getComponent(i)*number,i);
        }
        return multVector;
    }

    public float mulltVector(LAVector other) {
        float x = 0;
        int minSize = getSize();
        if (getSize()>other.getSize()) {
            minSize = other.getSize();
        } else {
            minSize = getSize();
        }
        for (int i = 0; i < minSize; i++) {
            x+=getComponent(i)*other.getComponent(i);
        }
        return x;
    }

    public float abs() {
        float abs = 0;
        for (int i = 0; i < getSize(); i++) {
            abs+= getComponent(i)*getComponent(i);
        }
        return (float)Math.sqrt(abs);
    }

    public float getComponent(int n) {
        return components[n];
    }

    public int getSize() {
        return components.length;
    }

    public float[] getComponents() {
        return components;
    }

    public void setComponents(float[] components) {
        this.components = components;
    }

    public void setComponent(float value,int number) {
        components[number] = value;
    }

    public String toString() {
        String print = "";
        for (int i = 0; i < components.length; i++) {
            print = print +" "+ components[i];
        }
        return print;
    }
}
