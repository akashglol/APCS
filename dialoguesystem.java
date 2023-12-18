import java.util.*;
public class dialoguesystem {
    /*Simple application of neural networks to demonstrate basic dialogue system*/
    public static void main(String[] args) {
//entry point of application
/*1. Initializes the neural network with an 'inputSize'.
2. Creates array of layers with layer sizes.
3. Creates network object with input size and array of layers.
4. Uses Scanner class to create a dialogue with the user by taking their inputs
a. Encodes user input and saves encoded array
b. Saves neural network output as 'intent' array
c. Calls generateResponse() to get a String response and prints it out.
*/
        int inputSize = 10;
        int[] layerSizes = {10,8,5};
        network neuralNetwork = new network(inputSize,layerSizes);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your input");
        String text = scan.next();

        double[] encode = encodeUserInput(text); // encode
        double[] ans = neuralNetwork.output(encode); // save
        String response = generateResponse(ans);
        System.out.println(response);
        scan.close();
    }
    /*Encodes user input into suitable format for neural network (no implementation
    required)*/
    private static double[] encodeUserInput(String input) {
        double[] encoded = new double[10];
        for( int i = 0;i< encoded.length;i++){
            encoded[i] =Math.random();
        }
        return encoded;
    }
    /*Generates response based on neural network's output
    Determines the response by getting the index of highest value in the 'intent'
    array
    (representing the neural network's output). Create 3-4 responses of your own
    to choose from as an output to return
    based on the highest index.*/
    private static String generateResponse(double[] intent) {
        String[] responses = {"hi, how are you doing?", "bye, it was nice talking to you!", "What do you mean", "I hear you"};
        int maxI = 0;
        double maxValue = intent[0];
        for( int i = 1;i<intent.length;i++){
            if (intent[i] > maxValue) {
                maxI = i;
                maxValue = intent[i];
            }
        }
        String ans = "";
        if( maxI >=0 && maxI < responses.length){
            ans = responses[maxI];
            return ans;
        }else {
            return "Thanks";
        }
    }
}
//hi
