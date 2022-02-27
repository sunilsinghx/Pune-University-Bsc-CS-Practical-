def main() :
    statesAndCapitals = {'Gujarat' : 'Gandhinagar','Maharashtra' : 'Mumbai','Rajasthan' : 'Jaipur','Bihar' : 'Patna'};

    print("Output :");
    for state, capital in statesAndCapitals.items():
        print(state, ":", capital)
if __name__ == "__main__" :
    main()