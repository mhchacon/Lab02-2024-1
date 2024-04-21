package estruturaDeDados;

import static org.junit.Assert.assertArrayEquals;

public class algoritmo implements Lista{
    int []array = new int[20];
    int elemento; 
    int posicao;
    int tamanho;
    
    @Override
    public boolean buscaElemento(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == elemento) {
                return true; 
            }
        }
        return false;
    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        int min = array[0];
        
        for(int i = 0; i < array.length; i++){
           if(array[i] < min){
            min = array[i];
           }
        }
        return min;
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        int max = array[0];
    
        for(int i = 0; i < array.length; i++){
           if(array[i] > max){
            max = array[i];
           }
        }
        return max;
    }
    

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        
        for (int i = array.length - 1; i > posicao; i--) {
            array[i] = array[i - 1];
        }

        
        array[posicao] = elemento;
    }
    

    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int buscaIndice(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereInicio'");
    }

    @Override
    public void insereFim(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }

}
