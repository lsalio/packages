include ../../env.make

BINS = delegating_constructor explicit

all: $(BINS)
.PHONY: all

delegating_constructor: delegating_constructor.cpp
	$(ECHO) Compile $@
	$(CC) $(FLAGS) -o $@ $^

explicit: explicit.cpp
	$(ECHO) Comile $@
	$(CC) $(FLAGS) -o $@ $^

.PHONY: clean
clean:
	@-rm -v $(BINS)

