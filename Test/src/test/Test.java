package test;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class Test {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Not eligible");
    }

    public static void main(String[] args) throws Exception {
        validate(16);
    }
}
