public class neuron {
    /*Represents single neuron in neural network*/
    private double[] weights;
    private double bias;
    /*Constructor to initialize neuron with specific number of inputs*/
/*Purpose: Constructor initialize neuron with specific number of inputs.
How it Works:
1. Creates an array of weights, one for each input.
2. Initializes each weight with a random value.
3. Initializes the bias with a random value.
*/
    public neuron(int inputs){
        weights = new double[inputs];
        for( int i = 0;i<weights.length;i++){
            weights[i] = (double)Math.random();
        }
        bias = Math.random();
    }
    public double neuronOutput(double[] inputs) {
/*Transforms input to a value between 0 and 1, which is useful for binary
classification*/
        double sum = 0.0;;
        for( int i = 0; i<inputs.length;i++){
            sum+= inputs[i] * weights[i];
        }
        sum+=bias;
        return sigmoid(sum);
    }

    private double sigmoid(double x) {
        double ans = 1/(1+Math.exp(-x));
        return ans;
    }
}
