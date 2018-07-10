import java.lang.Math;

class NeuralNetwork{
    double lr;
    double inputNodes[];
    double hiddenNodes[];
    double outputNodes[];
    Matrix weightsIH; //matriz com os pesos do Input para a Hidden
    Matrix weightsHO; //matriz com os pesos da Hidden para o Input
    Matrix biasH; //matriz com os bias para os nós hidden
    Matrix biasO; //matriz com os bias para os nós output

    NeuralNetwork(int nInput, int nHidden, int nOutput, double lr){
        this.inputNodes = new double[nInput];
        this.hiddenNodes = new double[nHidden];
        this.outputNodes = new double[nOutput];

        this.weightsIH = new Matrix(nHidden, nInput);
        this.biasH = new Matrix(nHidden, 1);
        //falta randomizar o bias e os weights

        this.weightsHO = new Matrix(nOutput, nHidden);
        this.biasO = new Matrix(nOutput, 1);
        //falta randomizar o bias e os weights

        this.lr = lr;
    }


    public double feedForward(Matrix inputs){
        //Generating the hidden outputs
        Matrix hidden = this.weightsIH.multiply(inputs);
        hidden = hidden.add(biasH);
        hidden = hidden.sigmoid();

        //Generating the output's output
        Matrix output = this.weightsHO.multiply(hidden);
        output = output.add(bias0);
        output = output.sigmoid();

        return output.data[0][0];
        //o output vem numa matriz de 1x1 pois só há um nó de output
    }

    public void train(double[] inputArray, double target){
        //1 - transformar o input numa matriz
        //2 - (criar a matriz hidden) multiplicar matriz weightsIH pelos inputs
        //3 - somar biasH à hidden
        //4 - passar a hidden pelo sigmoid
        //5 - (criar output) multiplicar o hidden pelos weightsHO
        //6 - somar a biasO a output
        //7 - passar a output pelo sigmoid

        //8 - (criar outputErrors)
    }


}
