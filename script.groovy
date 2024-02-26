def buildApp() {
    echo 'building...'
}

def testApp() {
    echo 'testing...'
}

def deployApp() {
    echo 'deploying...'
    echo "deploying ${params.VERSION}"
}

return this
