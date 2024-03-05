public class ContainerCalculator {
    public static void main(String[] args) {
        int amountOfBricks = 99;
        System.out.println("Number of Lego bricks we have: " + amountOfBricks);

        int containerCapacity = 2;
        System.out.println("Number of Lego blocks fit in one container: " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Number of full containers: " + fullContainers);

        int blocksInPartialContainer = amountOfBricks % containerCapacity;
        System.out.println("Number of blocks in the container that is not completely full: " + blocksInPartialContainer);

        int totalContainers = fullContainers + 1;
        System.out.println("Total number of containers: " + totalContainers);
    }
}
