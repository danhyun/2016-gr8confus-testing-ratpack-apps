import groovy.transform.Canonical
import ratpack.exec.Blocking
import ratpack.exec.Operation
import ratpack.exec.Promise

class ProfileService {
  final List<Profile> store = []
  Promise<List<Profile>> getProfiles() {
    Promise.value(store)
  }

  Operation add(Profile p) {
    Blocking.op {
      store.add(p)
    }
  }

  Operation delete() {
    Blocking.op {
      store.clear()
    }
  }
}

@Canonical
class Profile {
  String role
  String token
}
