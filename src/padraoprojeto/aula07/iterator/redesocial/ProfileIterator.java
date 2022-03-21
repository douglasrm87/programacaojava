package padraoprojeto.aula07.iterator.redesocial;


public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}