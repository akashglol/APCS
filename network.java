public class network {
    //represents entire neural net, consisting of mult. layers
    /*Constructor to create neural network with specified layers*/
    private layer[] layers;
    /*Purpose: Constructor initializes neural network with specific number of
    inputs.
    How it Works:
    1. Initializes array of layers with length of layerSizes array passed from
    the "SimpleDialogueSystem" class in the main method.
    2. Iterates through the above array. During this:
    a. We set an int variable 'prevLayerSize' every iteration to set the size
    of the previous layer.
    If the first layer of the network after the input is 0 (i = 0), then we
    set the variable
    to the inputSize. Otherwise, the variable is set to the size of the
    previous layer in the layerSizes array.
    b. Set the value at each index to a newly created Layer object with the
    current layer size and 'prevLayerSize'.
    */
    public network(int inputSize, int[] layerSizes) {
    }
    /*calculates output of network
    * 1. Create array that stores the double[] inputs array
    * 2. Iterate through layers array created above, and set each value of the
    array by calling the output() function for the
    * current layer on each respective input value.
    * 3. Return the array */
    public double[] output(double[] inputs) {
        return inputs;
    }
}


