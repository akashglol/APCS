/*class that represents layer of neurons in neural net*/
/*Represents layer of neurons in neural network*/
public class layer {
    private neuron[] neurons;
    /*Constructor creates a layer with a specified number of neurons
     * 1. Initialize neurons array above with size neuronCount.
     * 2. Create new Neuron objects for each element inside the neurons array.
     * */
    public layer(int neuronCount, int inputCount) {
    }
    /*calculate output of neuron based on inputs
     * 1. Initialize outputs array with of a size of the length of the neurons array
     * 2. Calculate outputs for each neuron object in neurons array
     * 3. Returns the output as a double array.
     * */
    public double[] output(double[] inputs) {
        return inputs;
    }
}
