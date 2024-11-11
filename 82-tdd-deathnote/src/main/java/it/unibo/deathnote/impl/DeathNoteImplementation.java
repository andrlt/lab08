import it.unibo.deathnote.api.DeathNote;

public class DeathNoteImplementation implements DeathNote {

    int ruleNumber;
    String name; 
    String cause; 

    @Override
    public String getRule(int ruleNumber) {
        if (ruleNumber < 1 || ruleNumber > RULES.size()) {
            throw new IllegalArgumentException();
        }
        this.ruleNumber = ruleNumber;
    }

    @Override
    public void writeName(String name) {
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
    }

    @Override
    public boolean writeDeathCause(String cause) {
    }

    @Override
    public boolean writeDetails(String details) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDetails'");
    }

    @Override
    public String getDeathCause(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeathCause'");
    }

    @Override
    public String getDeathDetails(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDeathDetails'");
    }

    @Override
    public boolean isNameWritten(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isNameWritten'");
    }
    
}