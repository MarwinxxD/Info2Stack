package c;

import java.util.Iterator;
import java.util.LinkedList;

public class Directory extends AbstractFile {
    LinkedList<AbstractFile> elements = new LinkedList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public int getSize() {
        int ret = 0;
        Iterator<AbstractFile> it = elements.iterator();
        while (it.hasNext()) {
            ret += it.next().getSize();
        }
        return ret;
    }
}
