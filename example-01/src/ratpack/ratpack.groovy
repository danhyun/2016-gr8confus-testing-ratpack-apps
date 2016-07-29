import static ratpack.groovy.Groovy.ratpack

ratpack {
  handlers {
    get {
      render 'Hello GR8ConfUS 2016!'
    }
  }
}
