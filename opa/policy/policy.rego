package http.authz

default allow = false

allow {
    input.path = ["api", "v1", "resource", "1"]
}

