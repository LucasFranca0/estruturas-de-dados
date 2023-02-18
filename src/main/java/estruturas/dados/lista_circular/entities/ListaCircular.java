package estruturas.dados.lista_circular.entities;

//**O último Nó(cabeça da lista) aponta para o primeiro Nó da Lista(cauda da lista), assim fazendo um Circulo**

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    // adiciona um Nó na última posição
    public void add(T conteudo) {
        No<T> novoNo = new No<T>(conteudo);
        // Se a lista estiver vazia, então meu novoNo é a cabeça da lista e a cauda
        if (isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        }

        // caso não, então meu novoNó será a nova cauda
        else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        // adicionamos + 1 ao tamanho da lista
        this.tamanhoLista++;
    }

    public void add(int index, T conteudo) {
        No<T> novoNo = new No<T>(conteudo);
        if (index > tamanhoLista) {
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista. O último indice é " + size());
        }
        No<T> noAuxiliar = this.cauda;

        if (index == 0 && !isEmpty()) {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        } else if (index == 0 && isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1 && this.cabeca != null) {
            novoNo.setNoProximo(this.cauda.getNoProximo());
            this.cauda.setNoProximo(novoNo);
            this.cabeca = novoNo;
        } else if (index > size() - 1) {
            novoNo.setNoProximo(cabeca.getNoProximo());
            this.cabeca.setNoProximo(novoNo);
            this.cabeca = novoNo;
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            novoNo.setNoProximo(noAuxiliar.getNoProximo());
            noAuxiliar.setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= tamanhoLista) {
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista. O último indice é " + (size() - 1));
        }
        No<T> noAuxiliar = this.cauda;
        // se for index 0, então estamos removendo a cauda da lista
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }
        // caso seja o segundo indice, então eu aponto a cauda para o Nó a frente do que eu desejo remover
        // assim removendo a referência do objeto e o GarbageCollector irá limpar os objetos sem referência
        else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            // pegamos o Nó anterior ao que queremos remover
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            if (index == size() -1) {
                noAuxiliar.setNoProximo(cabeca.getNoProximo());
                this.cabeca = noAuxiliar;
            }
            else {
                // Apontamos o Nó anterior para o Nó a frente do indice recebido
                noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
            }
        }
        this.tamanhoLista--;
    }

    // Retorna um Nó pelo indice
    private No<T> getNo(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }
        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = cauda;
        for (int i = 0; i < index; i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    // Retorna o conteúdo de um Nó pelo indice
    public T get(int index) {
        return getNo(index).getConteudo();
    }


    // Verifica se a lista está vazia
    public boolean isEmpty() {
        return tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }
}
