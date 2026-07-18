# ISCO Workforce Coordinator

Standalone actor repository for the complete ILO ISCO-08 classification mirror:
619 occupations across the 10/43/130/436 hierarchy.

- `manifest.edn`, `identity.edn`, `dependencies.edn`: canonical repository metadata
- `data/isco-occupations.edn`: authoritative occupation hierarchy
- `lex/`: canonical EDN API contracts
- `wire/`: external JSON, JSON-LD, BPMN, and sample payloads
- `src/isco/coordinator.clj`: kotoba-clj coordinator source

Run the deterministic, network-free suite with:

```sh
bb -cp src:test run_tests.clj
```

Generated WASM, shell build runners, and Go/TinyGo artifacts are intentionally
not repository assets. The external kotoba engine is pinned in `dependencies.edn`.
