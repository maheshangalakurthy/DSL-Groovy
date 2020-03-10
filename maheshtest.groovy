
pipelineJob('maheshtest') {

	parameters {
        booleanParam('FLAG', true,'select true')
        choiceParam('where to run', ['Docker (default)', 'AIX', 'Both'],'selectone')
		stringParam('hostname','0494','selected host to run)
    }
	
    definition {
        cps {
            script(readFileFromWorkspace('mahesh-test.groovy'))
            sandbox()
        }
    }
}
