pipelineJob('mahesh-test') {

	parameters {
        booleanParam('FLAG', true)
        choiceParam(''where to run, ['Docker (default)', 'AIX', 'Both'])
		stringParam('hostname','0494','selected host to run)
    }
	
    definition {
        cps {
            script(readFileFromWorkspace('mahesh-test.groovy'))
            sandbox()
        }
    }
}
