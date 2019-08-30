package hausdorff.space

import spock.lang.Specification

class OneWayLinkedListImplementationSpock extends Specification{


    def "add first element method"(){
        given:
        OneWayLinkedListImplementation spockTest = new OneWayLinkedListImplementation()

        when: "add some element to list"
        spockTest.addFirst(56)
        spockTest.addFirst(4)
        spockTest.addFirst(9)
        spockTest.addFirst(19)
        spockTest.addFirst(87)

        then: " asdawd"
        def solution = spockTest.get(0)
    }

    /*def "size is equals how many times function was use" () {
        give:
        OneWayLinkedListImplementation spockTest
    }*/
}
